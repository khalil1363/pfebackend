package org.devellopement.pfeback.services;

import org.devellopement.pfeback.entities.Role;
import org.devellopement.pfeback.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role AddRole(Role role) {
        return roleRepository.save(role);
    }
    @Override
    public void DeleteRole(Long id) {
         roleRepository.deleteById(id);

    }
    @Override
    public List<Role> RetreiveAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role updateRole(Role role, Long id) {
        role.setId(id);
        return roleRepository.save(role);
    }
}
