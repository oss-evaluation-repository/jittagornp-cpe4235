/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.connectdb;

import com.blogspot.na5cent.connectdb.model.Department;
import com.blogspot.na5cent.connectdb.printer.GenericPrinter;
import com.blogspot.na5cent.connectdb.query.Page;
import com.blogspot.na5cent.connectdb.query.Pagination;
import com.blogspot.na5cent.connectdb.service.DepartmentService;

/**
 *
 * @author anonymous
 */
public class S5QueryPagination {

    public static void main(String[] args) throws Exception {
        Pagination pagination = new Pagination(1, 5);
        Page<Department> page = DepartmentService.findAll(pagination);
        System.out.println("total elements = " + page.getTotalElements());
        System.out.println("total pages = " + page.getTotolPages());
        System.out.println("current page = " + page.getCurrentPageNumber());
        System.out.println("current page size = " + page.getCurrentPageSize());

        GenericPrinter.prints(page.getContents());
    }
}
