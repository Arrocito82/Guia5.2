package sv.edu.ues.fia.eisi.guia52;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentThree reproductor=new FragmentThree();
        Bundle bundle = new Bundle();
        bundle.putString("url", "ftp://loqueelaguasellevo.mp3");
        reproductor.setArguments(bundle);
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_one, FragmentOne.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("one") // name can be null
                .commit();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_three, reproductor)
                .setReorderingAllowed(true)
                .addToBackStack("three") // name can be null
                .commit();




    }






}