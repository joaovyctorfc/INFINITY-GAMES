/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vander
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of AutenticacaoUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testAutenticacaoUsuario() {
        System.out.println("AutenticacaoUsuario");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.AutenticacaoUsuario(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificacaoSeguranca method, of class UsuarioDAO.
     */
    @Test
    public void testVerificacaoSeguranca() {
        System.out.println("VerificacaoSeguranca");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.VerificacaoSeguranca(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarSenha method, of class UsuarioDAO.
     */
    @Test
    public void testAlterarSenha() {
        System.out.println("alterarSenha");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.alterarSenha(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelecionarDados method, of class UsuarioDAO.
     */
    @Test
    public void testSelecionarDados() {
        System.out.println("SelecionarDados");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.SelecionarDados(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarDados method, of class UsuarioDAO.
     */
    @Test
    public void testAlterarDados() {
        System.out.println("alterarDados");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.alterarDados(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RevelacaoPerfil method, of class UsuarioDAO.
     */
    @Test
    public void testRevelacaoPerfil() {
        System.out.println("RevelacaoPerfil");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.RevelacaoPerfil(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deconnect method, of class UsuarioDAO.
     */
    @Test
    public void testDeconnect() {
        System.out.println("Deconnect");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Deconnect(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cancelamento method, of class UsuarioDAO.
     */
    @Test
    public void testCancelamento() {
        System.out.println("Cancelamento");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Cancelamento(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hades method, of class UsuarioDAO.
     */
    @Test
    public void testHades() {
        System.out.println("Hades");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Hades(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HollowKnight method, of class UsuarioDAO.
     */
    @Test
    public void testHollowKnight() {
        System.out.println("HollowKnight");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.HollowKnight(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Terraria method, of class UsuarioDAO.
     */
    @Test
    public void testTerraria() {
        System.out.println("Terraria");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Terraria(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OneShot method, of class UsuarioDAO.
     */
    @Test
    public void testOneShot() {
        System.out.println("OneShot");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.OneShot(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HorizonChaseTurbo method, of class UsuarioDAO.
     */
    @Test
    public void testHorizonChaseTurbo() {
        System.out.println("HorizonChaseTurbo");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.HorizonChaseTurbo(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PunchClub method, of class UsuarioDAO.
     */
    @Test
    public void testPunchClub() {
        System.out.println("PunchClub");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.PunchClub(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StardewValley method, of class UsuarioDAO.
     */
    @Test
    public void testStardewValley() {
        System.out.println("StardewValley");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.StardewValley(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MoonLighter method, of class UsuarioDAO.
     */
    @Test
    public void testMoonLighter() {
        System.out.println("MoonLighter");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.MoonLighter(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ori method, of class UsuarioDAO.
     */
    @Test
    public void testOri() {
        System.out.println("Ori");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Ori(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Child method, of class UsuarioDAO.
     */
    @Test
    public void testChild() {
        System.out.println("Child");
        UsuarioDTO obj = null;
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.Child(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisarCompras method, of class UsuarioDAO.
     */
    @Test
    public void testPesquisarCompras() {
        System.out.println("PesquisarCompras");
        UsuarioDAO instance = new UsuarioDAO();
        ArrayList<UsuarioDTO> expResult = null;
        ArrayList<UsuarioDTO> result = instance.PesquisarCompras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
