/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestaoE.produto;

import com.gestaoE.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 07041626105
 */
@Repository
public interface ProdutoRepository  extends IArchRepository<Produto, Long>{
    
}