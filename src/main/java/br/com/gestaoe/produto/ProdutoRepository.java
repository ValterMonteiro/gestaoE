/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gestaoe.produto;

import br.edu.ifms.arch.v010.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends IArchRepository<Produto, Long>{
    
}