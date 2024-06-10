package com.Guesthub.GuestHub.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Guesthub.GuestHub.model.MenuItem;
import com.Guesthub.GuestHub.repository.MenuItemRepository;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public void saveMenuItem(MenuItem menuItem) {
        menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    public Optional<MenuItem> getMenuItemById(Long id) {
        return menuItemRepository.findById(id);
    }

	public void saveRegistered(@Valid MenuItem menuitem) {
		
		
	}
}
