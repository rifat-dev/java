package DataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CastleOnTheGrid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int grid[][] = new int[n][n];
        int color[][] = new int[n][n]; // color 0 = white, color 1 = gray = visited;          
        Queue<Node> queue = new LinkedList<>();
        

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase();

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'x') {
                    grid[i][j] = -1;
                }
            }
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        sc.close();

       
        
        color[startX][startY] = 1;
        Node node = new Node(startX,startY,0);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node q = queue.poll();
            int currentI = q.i;
            int currentJ = q.j;
            int currentMove = q.move;
            
            if(q.i==endX && q.j == endY){
                System.out.println(currentMove);
                break;
            }

            //Right 
            int tempI = currentI;
            int tempJ = currentJ + 1;
            while (tempJ < n && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    color[tempI][tempJ] = 1;
                    node = new Node(tempI,tempJ,currentMove+1);
                    queue.add(node);                   
                }
                tempJ++;
            }

            //Left
            tempI = currentI;
            tempJ = currentJ - 1;
            while (tempJ >= 0 && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    color[tempI][tempJ] = 1;
                    node = new Node(tempI,tempJ,currentMove+1);
                    queue.add(node);
                }
                tempJ--;
            }

            //Down
            tempI = currentI + 1;
            tempJ = currentJ;
            while (tempI < n && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    color[tempI][tempJ] = 1;
                    node = new Node(tempI,tempJ,currentMove+1);
                    queue.add(node);
                }
                tempI++;
            }

            //up
            tempI = currentI - 1;
            tempJ = currentJ;
            while (tempI >= 0 && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    color[tempI][tempJ] = 1;
                    node = new Node(tempI,tempJ,currentMove+1);
                    queue.add(node);
                }
                tempI--;
            }
        }          
    }
}

class Node {

    int i=0;
    int j=0;
    int move=0;
    
    public Node(int x, int y , int m) {
        this.i = x;
        this.j = y;
        this.move=m;
    }
   
}
