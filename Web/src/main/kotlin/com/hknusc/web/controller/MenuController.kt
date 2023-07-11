package com.hknusc.web.controller

import com.hknusc.web.dto.MenuDTO
import com.hknusc.web.dto.MenuEditDTO
import com.hknusc.web.service.MenuService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("menus")
class MenuController(private val menuService: MenuService) {
    @GetMapping
    fun getMenus() = menuService.getMenus()

    @GetMapping("{menuId}")
    fun getMenu(@PathVariable("menuId") menuId: Int) = menuService.getMenu(menuId)

    @PostMapping
    fun saveMenu(menuDTO: MenuDTO) = menuService.saveMenu(menuDTO)

    @PatchMapping
    fun editMenu(menuEditDTO: MenuEditDTO) = menuService.editMenu(menuEditDTO)

    @DeleteMapping("{menuId}")
    fun deleteMenu(@PathVariable("menuId") menuId: Int) = menuService.deleteMenu(menuId)
}