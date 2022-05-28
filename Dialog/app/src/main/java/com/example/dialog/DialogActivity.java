p
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dialog.ExampleDialog;
import com.example.dialog.R;

public class DialogActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog(){
        ExampleDialog exampleDIalog = new ExampleDialog();
        exampleDIalog.show(getSupportFragmentManager(), "example dialog");
    }
}ackage com.example.dialog;
