package edu.slincolgate.edm5things;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Load all xml page
        Button edm5things_all = (Button) findViewById(R.id.edm5things_all);
        edm5things_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, All.class);
                startActivity(launch_activity);
            }
        });

        // initialize SHM xml page
        ImageButton shm = (ImageButton) findViewById(R.id.shm_image_button);
        shm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(launch_activity);
            }
        });
        Button shm1 = (Button) findViewById(R.id.shm_learn_more);
        shm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(launch_activity1);
            }
        });

        // initialize AxwellIngrosso xml page
        ImageButton ax_ing = (ImageButton) findViewById(R.id.ax_ing_image_button);
        ax_ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, AxwellIngrosso.class);
                startActivity(launch_activity);
            }
        });
        Button ax_ing1 = (Button) findViewById(R.id.ax_ing_learn_more);
        ax_ing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity1 = new Intent(MainActivity.this, AxwellIngrosso.class);
                startActivity(launch_activity1);
            }
        });

        // initialize SteveAngello xml Page
        ImageButton steveangello = (ImageButton) findViewById(R.id.steve_angello_image_button);
        steveangello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, SteveAngello.class);
                startActivity(launch_activity);
            }
        });
        Button steveangello1 = (Button) findViewById(R.id.steve_angello_learn_more);
        steveangello1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity1 = new Intent(MainActivity.this, SteveAngello.class);
                startActivity(launch_activity1);
            }
        });

        // initialize Above and Beyond xml Page
        ImageButton above_n_beyond = (ImageButton) findViewById(R.id.above_n_beyond_image_button);
        above_n_beyond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, AboveAndBeyond.class);
                startActivity(launch_activity);
            }
        });
        Button above_n_beyond1 = (Button) findViewById(R.id.above_n_beyond_learn_more);
        above_n_beyond1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity1 = new Intent(MainActivity.this, AboveAndBeyond.class);
                startActivity(launch_activity1);
            }
        });

        // initialize Andrew Bayer xml Page
        ImageButton andrew_bayer = (ImageButton) findViewById(R.id.andrew_bayer_image_button);
        andrew_bayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity = new Intent(MainActivity.this, AndrewBayer.class);
                startActivity(launch_activity);
            }
        });
        Button andrew_bayer1 = (Button) findViewById(R.id.andrew_bayer_learn_more);
        andrew_bayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launch_activity1 = new Intent(MainActivity.this, AndrewBayer.class);
                startActivity(launch_activity1);
            }
        });

        // initialize Contact Me
        Button contactMe = (Button) findViewById(R.id.contact_me_button);
        contactMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sawsanlin.7@gmail.com"});
                //intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                //intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, ""));
                }
            }
        });
    }
}

    /*public void initSHM (View view) {// initialize SHM xml page
        switch (view.getId()){
            case R.id.shm_image_button:
                ImageButton shm = (ImageButton) findViewById(R.id.shm_image_button);
                shm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent launch_activity = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(launch_activity);
                    }
                });
            break;

            case R.id.shm_learn_more:
                Button shm1 = (Button) findViewById(R.id.shm_learn_more);
                shm1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent launch_activity1 = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(launch_activity1);
                    }
                });
                break;
        }
    }

    public void initAxwellIngrosso (View view) {// initialize AxwellIngrosso xml page
        switch (view.getId()){
            case R.id.ax_ing_image_button:
                ImageButton ax_ing = (ImageButton) findViewById(R.id.ax_ing_image_button);
                ax_ing.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity = new Intent(MainActivity.this, AxwellIngrosso.class);
                        startActivity(launch_activity);
                    }
                });
                break;

            case R.id.ax_ing_learn_more:
                Button ax_ing1 = (Button) findViewById(R.id.ax_ing_learn_more);
                ax_ing1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity1 = new Intent(MainActivity.this, AxwellIngrosso.class);
                        startActivity(launch_activity1);
                    }
                });
                break;
        }
    }

    public void initSteveAngello (View view) {// initialize SteveAngello xml page
        switch (view.getId()){
            case R.id.steve_angello_image_button:
                ImageButton steveangello = (ImageButton) findViewById(R.id.steve_angello_image_button);
                steveangello.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity = new Intent(MainActivity.this, SteveAngello.class);
                        startActivity(launch_activity);
                    }
                });
                break;

            case R.id.steve_angello_learn_more:
                Button steveangello1 = (Button) findViewById(R.id.steve_angello_learn_more);
                steveangello1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity1 = new Intent(MainActivity.this, SteveAngello.class);
                        startActivity(launch_activity1);
                    }
                });
                break;
        }
    }

    public void initAboveNBeyond (View view) {// initialize Above And Beyond xml page
        switch (view.getId()){
            case R.id.above_n_beyond_image_button:
                ImageButton above_n_beyond = (ImageButton) findViewById(R.id.above_n_beyond_image_button);
                above_n_beyond.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity = new Intent(MainActivity.this, AboveAndBeyond.class);
                        startActivity(launch_activity);
                    }
                });
                break;

            case R.id.above_n_beyond_learn_more:
                Button above_n_beyond1 = (Button) findViewById(R.id.above_n_beyond_learn_more);
                above_n_beyond1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity1 = new Intent(MainActivity.this, AboveAndBeyond.class);
                        startActivity(launch_activity1);
                    }
                });
                break;
        }
    }

    public void initAndrewBayer (View view) {// initialize AndrewBayer xml page
        switch (view.getId()){
            case R.id.andrew_bayer_image_button:
                ImageButton andrew_bayer = (ImageButton) findViewById(R.id.andrew_bayer_image_button);
                andrew_bayer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity = new Intent(MainActivity.this, AndrewBayer.class);
                        startActivity(launch_activity);
                    }
                });
                break;

            case R.id.andrew_bayer_learn_more:
                Button andrew_bayer1 = (Button) findViewById(R.id.andrew_bayer_learn_more);
                andrew_bayer1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent launch_activity1 = new Intent(MainActivity.this, AndrewBayer.class);
                        startActivity(launch_activity1);
                    }
                });
                break;
        }
    }



    public void initContact (View view) {// when initiate compose email function
        Button contactMe = (Button) findViewById(R.id.contact_me_button);
        contactMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sawsanlin.7@gmail.com"});
                //intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                //intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, ""));
                }
            }
        });
    }
*/

