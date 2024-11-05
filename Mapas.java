import java.util.ArrayList;
public class Mapas {
     int[][] mapa1 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},
            {1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,2,2,2,2,1,2,2,2,1,0,0,0,2,1},
            {1,2,2,2,2,2,1,2,2,2,1,2,2,2,1,1,1,2,1,2,1,2,1,2,1,0,0,1,2,1},
            {1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,0,0,1,2,1},
            {1,2,1,2,1,2,1,2,1,2,2,2,1,2,2,2,1,2,1,2,2,2,1,2,1,0,0,1,2,1},
            {1,2,1,1,1,2,1,2,1,1,1,2,1,2,1,2,1,2,1,1,1,2,1,2,1,1,1,1,2,1},
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
    int [][] mapa2 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,1,2,1,2,1,2,2,2,2,2,1,1,2,2,2,2,2,1,2,1,2,1,2,2,2,1},
            {1,2,1,2,2,2,1,2,2,2,1,2,1,2,2,2,2,1,2,1,2,2,2,1,2,2,2,1,2,1},
            {1,2,1,2,1,2,2,2,1,2,1,2,1,1,0,0,1,1,2,1,2,1,2,2,2,1,2,1,2,1},
            {1,2,1,2,1,2,1,2,1,2,1,2,1,0,0,0,0,1,2,1,2,1,2,1,2,1,2,1,2,1},
            {1,2,1,2,1,2,1,2,1,2,1,2,1,0,0,0,0,1,2,1,2,1,2,1,2,1,2,1,2,1},
            {1,2,1,2,1,2,2,2,1,2,1,2,1,1,1,1,1,1,2,1,2,1,2,2,2,1,2,1,2,1},
            {1,2,1,2,2,2,1,2,2,2,1,2,1,2,2,2,2,1,2,1,2,2,2,1,2,2,2,1,2,1},
            {1,2,2,2,1,2,1,2,1,2,2,2,2,2,1,1,2,2,2,2,2,1,2,1,2,1,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
    
    ArrayList <int[]> mapas = new ArrayList<>();
    mapas.add(mapa1);
    mapas.add(mapa2);
}
