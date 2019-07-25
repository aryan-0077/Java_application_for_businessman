
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author babbi
 */
public class MyPage implements java.awt.print.Printable
{    

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        graphics.drawString("Hellggggggg",50, 50);
        return 0;
    }
    
}

