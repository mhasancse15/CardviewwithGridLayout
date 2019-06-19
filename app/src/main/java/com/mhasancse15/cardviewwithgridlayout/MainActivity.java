package com.mhasancse15.cardviewwithgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mhasancse15.cardviewwithgridlayout.Adapter.RecyclerViewAdapter;
import com.mhasancse15.cardviewwithgridlayout.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book> lstBook;
    private RecyclerView myrv;
    RecyclerViewAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot", "Categorie Book", "Description book", R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples", "Categorie Book", "Description book", R.drawable.mariasemples));
        lstBook.add(new Book("The Martian", "Categorie Book", "Description book", R.drawable.themartian));
        lstBook.add(new Book("He Died with...", "Categorie Book", "Description book", R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot", "Categorie Book", "Description book", R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples", "Categorie Book", "Description book", R.drawable.mariasemples));
        lstBook.add(new Book("The Martian", "Categorie Book", "Description book", R.drawable.themartian));
        lstBook.add(new Book("He Died with...", "Categorie Book", "Description book", R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.thevigitarian));
        lstBook.add(new Book("The Wild Robot", "Categorie Book", "Description book", R.drawable.thewildrobot));
        lstBook.add(new Book("Maria Semples", "Categorie Book", "Description book", R.drawable.mariasemples));
        lstBook.add(new Book("The Martian", "Categorie Book", "Description book", R.drawable.themartian));
        lstBook.add(new Book("He Died with...", "Categorie Book", "Description book", R.drawable.hediedwith));

        myrv = findViewById(R.id.recyclerview_id);
        myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
    }
}
