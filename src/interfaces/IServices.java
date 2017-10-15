/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Sami
 */
public interface IServices<T,R> {
    
    void add(T t);
    void update( T t);
    void delete(T t);
    List<T> getAll();
    T getById(R r);
    
    
}
