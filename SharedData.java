/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author nidhi
 */
import javax.swing.table.DefaultTableModel;

public class SharedData {
    public static DefaultTableModel tableModel = new DefaultTableModel(
        new Object[]{"Expense", "Category"}, 0
    );
}