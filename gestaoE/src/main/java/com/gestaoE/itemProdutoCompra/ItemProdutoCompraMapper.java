/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestaoE.itemProdutoCompra;

import com.gestaoE.arch.BaseObjectMapper;
import com.gestaoE.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface ItemProdutoCompraMapper extends ISimpleMapper<ItemProdutoCompra, ItemProdutoCompraDto, 
                    ItemProdutoCompraForm> {

    public static final ItemProdutoCompraMapper INSTANCE = Mappers.getMapper(ItemProdutoCompraMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public ItemProdutoCompra formToEntity(ItemProdutoCompraForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public ItemProdutoCompra update(ItemProdutoCompraForm dto, @MappingTarget ItemProdutoCompra entity);

    
}