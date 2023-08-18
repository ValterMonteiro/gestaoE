/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.produto;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.com.gestaoe.arch.BaseObjectMapper;
import br.com.gestaoe.arch.ISimpleMapper;

@Mapper(
        config = BaseObjectMapper.class
        
)
public interface ProdutoMapper extends ISimpleMapper<Produto, ProdutoDto, ProdutoForm> {

    public static final ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Produto formToEntity(ProdutoForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Produto update(ProdutoForm dto, @MappingTarget Produto entity);

    
}