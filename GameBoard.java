package ProjectWarshipsGame;

import java.util.Random;

public class GameBoard {
    Random rand = new Random();
    private int x = 1;//rand.nextInt(10);
    private int y = 1;//rand.nextInt(10);
    private String [][] array = new String[10][10];

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void startGame(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "0";
            }
        }
        int z = rand.nextInt(2);
        if (z==0){
            for (int i = 0; i < 4; i++) {
                array[getX()][getY()+i] = "4";
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6; j++) {
                    if (array[(getX()-1)+i][(getY()-1)+j]=="0") {
                        array[(getX()-1)+i][(getY()-1)+j] = "P";
                    }
                }
            }
        }else {
            for (int i = 0; i < 4; i++) {
                array[getX()+i][getY()] = "4";
            }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if (array[(getX()-1)+i][(getY()-1)+j]=="0") {
                        array[(getX()-1)+i][(getY()-1)+j] = "P";
                    }
                }
            }
        }
    }
    public void vievBoard(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%s\t", array[i][j]);
            }
            System.out.println();
        }
    }

}

