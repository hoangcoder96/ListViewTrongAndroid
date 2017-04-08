package nhatto.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String number[] = {"01234210200","0123456789","0987654321","0988656551","04365879123","0654232323","0987456321"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv_contact);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,number);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, number[position]+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
