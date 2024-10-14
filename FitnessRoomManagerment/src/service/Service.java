
package service;

public interface Service<T> {
    
    T findByID(String id);
    
    void display();
    
    void add(T entity);
    
    void save();
            
    void update(T entity);
    
}
