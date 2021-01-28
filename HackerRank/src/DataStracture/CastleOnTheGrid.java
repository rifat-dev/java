package DataStracture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class CastleOnTheGrid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int grid[][] = new int[n][n];
        int color[][] = new int[n][n]; // color 0 = w, color 1 = gray , color 2 = red;
        Node parent[][] = new Node[n][n]; // 
        Stack<Integer> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        Node node = new Node();

        for (int i = 0; i < n; i++) {
           String s = sc.nextLine();
            
            for (int j = 0; j <s.length(); j++) {
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
        parent[startX][startY] = new Node(startX, startY);
        node.i = startX;
        node.j = startY;
        queue.add(node);
        
        while (!queue.isEmpty()) {
            Node q = queue.poll();
            int currentI = q.i;
            int currentJ = q.j;

            //Right 
            int tempI = currentI;
            int tempJ = currentJ + 1;
            while (tempJ < n && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    parent[tempI][tempJ] = new Node(currentI, currentJ);
                    color[tempI][tempJ] = 1;
                    node.i = tempI;
                    node.j = tempJ;
                    queue.add(node);
                }
                tempJ++;
            }

            //Left
            tempI = currentI;
            tempJ = currentJ - 1;
            while (tempJ >= 0 && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    parent[tempI][tempJ] = new Node(currentI, currentJ);
                    color[tempI][tempJ] = 1;
                    node.i = tempI;
                    node.j = tempJ;
                    queue.add(node);
                }
                tempJ--;
            }

            //Down
            tempI = currentI + 1;
            tempJ = currentJ;
            while (tempI < n && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    parent[tempI][tempJ] = new Node(currentI, currentJ);
                    color[tempI][tempJ] = 1;
                    node.i = tempI;
                    node.j = tempJ;
                    queue.add(node);
                }
                tempI++;
            }
            
            
            //up
            tempI = currentI - 1;
            tempJ = currentJ;
            while (tempI >= 0 && grid[tempI][tempJ] != -1) {
                if (color[tempI][tempJ] == 0) {
                    parent[tempI][tempJ] = new Node(currentI, currentJ);
                    color[tempI][tempJ] = 1;
                    node.i = tempI;
                    node.j = tempJ;
                    queue.add(node);
                }
                tempI--;
            }

        }
        
        int pathX = parent[endX][endY].i;
        int pathY = parent[endX][endY].j;
        stack.push(1);
        while((pathX != startX) || (pathY != startY)){
            System.out.println(pathX + " "+ pathY);
            stack.push(1);
            pathX = parent[pathX][pathY].i;
            pathY = parent[pathX][pathY].j; 
            System.out.println(pathX + " "+ pathY);
        }
        
        
        System.out.println(stack.size());

    }

}

class Node {

    int i;
    int j;

    public Node(int x, int y) {
        this.i = x;
        this.j = y;
    }

    public Node() {
    }

}
