package com.example.prototype;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.OutputStream;


public class NoticeFiveD extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    String g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24,g25;


    //cameraend
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_five_d);

        //submitt end button


        Button submit=(Button) findViewById(R.id.Submit);
        Button back=(Button) findViewById(R.id.back1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                Intent Fir   = new Intent(NoticeFiveD.this,NoticePanel.class);
                startActivity(Fir);
            }
        });
        ///

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent get data

                Intent i =getIntent();
                g1=i.getStringExtra("name");
                g2=i.getStringExtra("address");
                g3=i.getStringExtra("typeB");
                g4=i.getStringExtra("m1");
                g5=i.getStringExtra("m2");
                g6=i.getStringExtra("m3");
                g7=i.getStringExtra("cal");
                g8=i.getStringExtra("c1");
                g9=i.getStringExtra("c2");
                g10=i.getStringExtra("c3");
                g11=i.getStringExtra("c4");
                g12=i.getStringExtra("D1");

                g13=i.getStringExtra("name2");
                g14=i.getStringExtra("age");
                g15=i.getStringExtra("pc");
                g16=i.getStringExtra("mbn");
                g17=i.getStringExtra("address2");
                g18=i.getStringExtra("depart");

                g19=i.getStringExtra("e1");
                g20=i.getStringExtra("e2");
                g21=i.getStringExtra("e3");
                g22=i.getStringExtra("f1");
                g23=i.getStringExtra("f2");
                g24=i.getStringExtra("f3");

                g25=i.getStringExtra("ps");

                //

                EditText t1=(EditText) findViewById(R.id.t1);
                String p1=t1.getText().toString();

                EditText t2=(EditText) findViewById(R.id.t2);
                String p2=t2.getText().toString();

                EditText t3=(EditText) findViewById(R.id.t3);
                String p3=t3.getText().toString();

                EditText t4=(EditText) findViewById(R.id.t4);
                String p4=t4.getText().toString();

                EditText t5=(EditText) findViewById(R.id.t5);
                String p5=t5.getText().toString();

                EditText t6=(EditText) findViewById(R.id.t6);
                String p6=t6.getText().toString();

                EditText t7=(EditText) findViewById(R.id.t7);
                String p7=t7.getText().toString();

                EditText t8=(EditText) findViewById(R.id.t8);
                String p8=t8.getText().toString();

                // Toast.makeText(NoticeOne.this,p1+p2+p3+p4+p5+p8,Toast.LENGTH_SHORT).show();
                try {

                    ContentValues values = new ContentValues();
                    String folder="/"+"PCM_APP"+"/"+g1+"/";
                    String filename="डी_सी_आर_ता_"+g1;
                    values.put(MediaStore.MediaColumns.DISPLAY_NAME, filename);       //file name
                    values.put(MediaStore.MediaColumns.MIME_TYPE, "application/msword");        //file extension, will automatically add to file
                    values.put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOCUMENTS + folder);     //end "/" is not mandatory

                    Uri uri = getContentResolver().insert(MediaStore.Files.getContentUri("external"), values);      //important!

                    OutputStream outputStream = getContentResolver().openOutputStream(uri);

                    outputStream.write(("\t\t\t\t  डी.सी.आर.ता. "+p1+"\n" +

                            "१ | पोलीस स्टेशन \t| "+g25+", पिंपरी चिंचवड. \n\n"+

                            "२ | गु. र. नं.  \t|  "+p2+"\n\n"+

                            "३ |  कलम      \t|   महराष्ट्र महानगरपालिका अधिनियम १९४९ चे कलम ३४७ (१)(अ) ब " +
                            " Clause 397A (1) (b)\n\n" +
                            "४ | फिर्यादी नाव पत्ता \t | "+g22+" वय "+g23+" वर्षे व्यवसाय - नोकरी - "+g24+" पिंपरी चिंचवड महानगरपालिका पिंपरी , पुणे, "+g17+", पुणे-"+g15+". मो.नं "+g16+".\n\n"+

                            "५ | आरोपी नाव व पत्ता\t | श्री. "+g1+", पत्ता- स. नं. "+p3+","+g2+", पुणे- "+g15+".\n\n"+

                            "६ | आरोपी अटक ता.वेळ\t| नाही \n\n"+

                            "७ | पाहिजे आरोपी      \t| --- \n\n"+

                            "८ | गु.घडला ता.वेळ ठिकाण \t| दि."+p1+", वेळ – "+t3+" वाजता,  स. नं. "+p3+", "+g2+", पुणे-"+g15+".\n\n"+

                            "९ | गु.घडला ता.वे ठिकाण  \t | दिनांक- "+p1+"   वा -"+t3+"\n\n"+

                            "१० | विलंबाचे कारण      \t | फिर्यादी उशिरा आल्याने\n\n"+

                            "११ | घटनास्थळ    \t| स.नं."+p3+","+g2+", पुणे-"+g15+".\n\n\n"+

                            "१२ | दिशा व अंतर \t| "+p6+"\n\n"+

                            "१३ | गुन्हयाचे कारण \t| स्वतःचा फायदा \n\n"+

                            "१४ | गुन्ह्यात वापरलेले हत्यार \t| निरंक \n\n"+

                            "१५ | गुन्ह्यात हस्तगर हत्यार  \t| निरंक\n\n"+

                            "१६ | गेला माल    \t| निरंक\n\n"+

                            "१७ | मिळाला माल \t| निरंक निरंक\n\n"+

                            "१८ | पिडीत व्यक्तीचे नाव \t| निरंक\n\n"+

                            "१९ | मयताचे नाव   \t| निरंक\n\n"+

                            "२० | जखमीचे नाव  \t| निरंक\n\n"+

                            "२१ | रुग्णालयाचे नाव \t| निरंक\n\n"+

                            "२२ | तपासी अधिकारी \t| \n\n"+

                            "२३ | दाखल अमलदार \t| "+g25+"\n\n"+

                            "२४ | प्रभारी अधिकारी \t| "+p7+",वरिष्ठ पोलीस निरीक्षक,"+g25+"\n\n"+

                            "२५ | भेट देणारे अधिकारी \t| "+p8+",पोलीस उप निरीक्षक,"+g25+"\n\n"+

                            "२६ | थोडक्यात हकीकत \t| यातील फिर्यादी याची फिर्यादी कि,वर नमूद ता.वेळ व ठिकाणी यातील\n" +
                            "\tआरोपी श्री. "+g1+",यांनी सदरची जागा मध्ये त्यांनी\n" +
                            "\tबांधकामाकरिता पिंपरी चिंचवड महानगरपालिकेची परवानगी न घेता\n" +
                            "\t"+g4+" मी. X "+g5+" मी.X "+g6+" मजले = "+g7+" चौ.मी.\n" +
                            "\tबांधकाम विनापरवाना अनधिकृतपणे केले असल्याने फिर्यादी यांनी त्यांचे \n" +
                            "\tविरुद्ध महाराष्ट्र महानगरपालिका अधिनियम१९४९चे कलम३९७ (१) (अ) (ब)\n" +
                            "\t{clause 397A (1) (b)} अन्वये कायदेशीर दिली आहे.\n" +
                            "\tम्हणून वरील प्रमाणे गुन्हा दाखल आहे.\n\n"+

                            "२७ | सध्याची परिस्थिती \t|  \n\n"+"").getBytes());

                    outputStream.close();

                    Toast.makeText(NoticeFiveD.this, "File created successfully", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(NoticeFiveD.this, "Fail to create file", Toast.LENGTH_SHORT).show();
                }

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(NoticeFiveD.this);
                alertDialogBuilder.setMessage("Do You Want To Fill Evacuation Notice");

                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent Fir   = new Intent(NoticeFiveD.this,NoticeSix.class);

                                Fir.putExtra("name",g1);
                                Fir.putExtra("address",g2);

                                Fir.putExtra("typeB",g3);

                                Fir.putExtra("m1",g4);
                                Fir.putExtra("m2",g5);
                                Fir.putExtra("m3",g6);
                                Fir.putExtra("cal",g7);

                                Fir.putExtra("c1",g8);
                                Fir.putExtra("c2",g9);
                                Fir.putExtra("c3",g10);
                                Fir.putExtra("c4",g11);

                                Fir.putExtra("D1",g12);


                                Fir.putExtra("name2",g13);
                                Fir.putExtra("age",g14);
                                Fir.putExtra("pc",g15);
                                Fir.putExtra("mbn",g16);
                                Fir.putExtra("address2",g17);
                                Fir.putExtra("depart",g18);

                                Fir.putExtra("e1",g19);
                                Fir.putExtra("e2",g20);
                                Fir.putExtra("e3",g21);
                                Fir.putExtra("f1",g22);
                                Fir.putExtra("f2",g23);
                                Fir.putExtra("f3",g24);

                                Fir.putExtra("ps",g25);

                                startActivity(Fir);
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                        Intent Fir   = new Intent(NoticeFiveD.this,NoticePanel.class);
                        startActivity(Fir);
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });





//submitt end button end


    }

    //spinner method
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
//spinner method end
}

