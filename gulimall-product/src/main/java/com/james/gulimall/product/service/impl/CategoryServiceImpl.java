package com.james.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.common.utils.PageUtils;
import com.james.common.utils.Query;
import com.james.gulimall.product.dao.CategoryDao;
import com.james.gulimall.product.entity.CategoryEntity;
import com.james.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 组装成父子树形结构
        List<CategoryEntity> levelMenus = entities.stream().filter((categoryEntity) -> categoryEntity.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildren(menu, entities));
                    return menu;
                })
                .sorted((menu1, menu2) -> (menu1.getSort()) == null ? 0 : menu1.getSort() - (menu2.getSort() == null ? 0 : menu2.getSort()))
                .collect(Collectors.toList());




        return levelMenus;
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            // 递归找到子菜单
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> (menu1.getSort()) == null ? 0 : menu1.getSort() - (menu2.getSort() == null ? 0 : menu2.getSort())).collect(Collectors.toList());
        return children;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1.检查当前删除的菜单，是否被其他地方引用

        //逻辑删除，利用一个字段标识是否被删除



        baseMapper.deleteBatchIds(asList);
    }



}