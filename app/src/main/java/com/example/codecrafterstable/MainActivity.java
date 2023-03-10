package com.example.codecrafterstable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity {
    String[] headers = {"ID", "Co_id", "Center", "Price", "Close", "Status"};
//    String[][] data = {{"1", "John", "Doe","89"},{"2", "Jane", "Doe","69"} };
//    String ID;
//    String co_id;
//    String collection_center;
//    String purchase_price;
//    String close;
//    String status;
    Center[] centers = {
        new Center("1", "1", "Kiganjo", "123", "1", "1"),
        new Center("2", "1", "Kamwangi", "130", "1", "1"),
        new Center("3", "3", "Karuri", "140", "1", "1"),
        new Center("4", "3", "Kariua", "100", "1", "1"),
        new Center("5", "2", "Kangundo", "120", "1", "1"),
        new Center("6", "4", "Gititu", "120", "1", "1")
};
//    List<Center> centerList = new ArrayList<>();
Center[][] collectionCenters2D = new Center[6][6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        centerList.addAll(Arrays.asList(centers));
        for (int i = 0; i < centers.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (centers[i] != null && centers[i].getID().equals(String.valueOf(j+1))) {
                    collectionCenters2D[j][i] = centers[i];
                }
            }
        }


        TableView<String[]> tableView =findViewById(R.id.table_data_view);

        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this, headers));
        String[][] stringData = convertCentersToStringArray(collectionCenters2D);
        tableView.setDataAdapter(new SimpleTableDataAdapter(this, stringData));;

    }

    public static String[][] convertCentersToStringArray(Center[][] centers) {
        String[][] stringData = new String[centers.length][centers[0].length];
        for (int i = 0; i < centers.length; i++) {
            for (int j = 0; j < centers[0].length; j++) {
                if (centers[i][j] != null) {
                    stringData[i][0] = centers[i][j].getID();
                    stringData[i][1] = centers[i][j].getCo_id();
                    stringData[i][2] = centers[i][j].getCollection_center();
                    stringData[i][3] = centers[i][j].getPurchase_price();
                    stringData[i][4] = centers[i][j].getClose();
                    stringData[i][5] = centers[i][j].getStatus();
                }
            }
        }
        return stringData;
    }


    public static String[] convertCentersToStringArray2(Center[][] centers) {
        String[][] stringData = convertCentersToStringArray(centers);
        String[] rowData = new String[centers.length];
        for (int i = 0; i < centers.length; i++) {
            rowData[i] = String.join(",", stringData[i]);
        }
        return rowData;
    }






}