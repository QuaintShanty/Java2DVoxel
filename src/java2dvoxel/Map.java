/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2dvoxel;

/**
 * Contains tile objects that contain game objects.
 * @author Kristopher Ali
 */
public class Map {
    public Tile[][] data;
    public int sizeX, sizeY;
    
    public Map(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        data = new Tile[sizeX][sizeY];
    }
}
