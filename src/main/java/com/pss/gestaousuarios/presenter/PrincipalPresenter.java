/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaousuarios.presenter;

import com.pss.gestaousuarios.dao.SqliteDao;
import com.pss.gestaousuarios.dao.UsuarioDao;
import com.pss.gestaousuarios.view.PrincipalView;

/**
 *
 * @author pedro
 */
public class PrincipalPresenter {
    public static void main(String[] args) {
    UsuarioDao dao = new SqliteDao();
        new PrincipalView(dao);
    }
}
