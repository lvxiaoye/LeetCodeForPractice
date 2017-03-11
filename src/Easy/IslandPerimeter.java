package Easy;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int[][] grids1 = {{1}};
		int[][] a ={{0},{1},{1},{0}};
		int[][] b = {{0,1,1,1}};
		//System.out.println(grids1.length+","+grids1[0].length);
		System.out.println(islandPerimeter(grid));
		System.out.println(islandPerimeter(grids1));
		System.out.println(islandPerimeter(a));
		System.out.println(islandPerimeter(b));
		
	}

    public static int islandPerimeter(int[][] grid){
    	int perimeter =0;
    	if(grid == null){
    		return 0;
    	}else if(grid.length ==1 & grid[0].length ==1){
    		return 4;
    	}else if(grid.length ==1){
    		for(int i=0;i<grid[0].length;i++){
    			if(grid[0][i]==1){
    				if(i==0){
    					perimeter += 3+(grid[0][i+1] ==0?1:0);
    				}else if(i==grid[0].length-1){
    					perimeter += 3+(grid[0][i-1] ==0?1:0);
    				}else
    					perimeter += 2+(grid[0][i+1] ==0?1:0)+(grid[0][i-1] ==0?1:0);
    				
    			}
    		}
    	}else if(grid[0].length ==1){
    		for(int i=0;i<grid.length;i++){
    			if(grid[i][0]==1){
    				if(i==0){
    					perimeter += 3+(grid[i+1][0] ==0?1:0);
    				}else if(i==grid.length-1){
    					perimeter += 3+(grid[i-1][0] ==0?1:0);
    				}else
    					perimeter += 2+(grid[i+1][0] ==0?1:0) +(grid[i-1][0] ==0?1:0);
    				
    			}
    		}
    	}else{
        for(int i =0;i<grid.length;i++){
        	for(int j=0;j<grid[i].length;j++){
        		if(grid[i][j]==1){
        		if(i==0 & j==0){
        			perimeter += 2+((grid[i][j+1] == 0)? 1:0) +((grid[i+1][j] == 0)? 1:0); 
        		}else if(i==0 & j ==grid[0].length-1){
        			perimeter += 2+((grid[i][j-1] == 0)? 1:0) +((grid[i+1][j] == 0)? 1:0); 
        		}else if(i==grid.length-1 & j==0){
        			perimeter += 2+((grid[i][j+1] == 0)?1:0) +((grid[i-1][j] == 0)? 1:0);
        		}else if(i == grid.length-1 & j==grid[i].length-1){
        			perimeter += 2+((grid[i-1][j] == 0)? 1:0) +((grid[i][j-1] == 0)? 1:0);     
        		}else if(i==0){
        			perimeter += 1+((grid[i][j+1] == 0)? 1:0) +((grid[i+1][j] == 0)? 1:0) +((grid[i][j-1] == 0)? 1:0);
        		}else if(i == grid.length-1){
        			perimeter += 1+ ((grid[i][j+1] == 0)? 1:0) +((grid[i-1][j] == 0)? 1:0) +((grid[i][j-1] == 0)? 1:0); 
        		}else if( j ==0){
        			perimeter += 1+((grid[i][j+1] == 0)? 1:0) +((grid[i+1][j] == 0)? 1:0) +((grid[i-1][j] == 0)? 1:0); 
      
        		}else if( j == grid[i].length-1){
        			perimeter += 1+((grid[i-1][j] == 0)? 1:0) +((grid[i+1][j] == 0)? 1:0) +((grid[i][j-1] == 0)? 1:0);  
        		}else{
        			perimeter += ((grid[i][j+1] == 0)? 1:0) +((grid[i+1][j] == 0)?1:0) +((grid[i][j-1] == 0)?1:0)+((grid[i-1][j] == 0)? 1:0); 
        		}
        		}
        	}
        }
    	}
        return perimeter;
    }
    
    /*(╥╯^╰╥)  我一定是一只猪。。。。。。
     * public class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}

Java 9 line solution, add 4 for each land and remove 2 for each internal edge
public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i-1][j] == 1) result -= 2;
                    if (j > 0 && grid[i][j-1] == 1) result -= 2;
                }
            }
        }
        return result;
    }
     */
        
}
