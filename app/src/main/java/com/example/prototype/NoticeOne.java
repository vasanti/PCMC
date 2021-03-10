package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NoticeOne extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText t10,t11,t12,t13;
    Button submit;
    File file;
    String sp1,sp2,sp3;
    OutputStream outputStream;



    //dropdown
    String[] users = { "श्री.", "श्रीमती"};

    String[] types={"आर सी सी फुटिंग (जोते बांधकाम)","आर सी सी बांधकाम (तळमजला)","आर सी सी बांधकाम पहिला मजला (वाढीव बांधकाम)",
            "आर सी सी बांधकाम पहिला मजला व दुसरा मजला (वाढीव बांधकाम)","आर सी सी बांधकाम दुसरा मजला (वाढीव बांधकाम)",
            "आर सी सी बांधकाम दुसरा मजला व तिसरा मजला (वाढीव बांधकाम)","आर सी सी बांधकाम तिसरा मजला (वाढीव बांधकाम)",
            "आर सी सी बांधकाम तिसरा मजला व चौथा मजला (वाढीव बांधकाम)","साधे वीटबांधकाम व पत्रा ",
            "आर सी सी बांधकाम (तळमजला व पहिला मजला)"};

    String[] type1={"अ","ब","क","ड","ई","फ","ह","ग"};

    //dropdownend

    //camera
    private static int IMG_RESULT = 1;
    String ImageDecode;
    ImageView imageViewLoad,imageViewLoad1,imageViewLoad2,imageViewLoad3;
    Button LoadImage,LoadImage1,LoadImage2,LoadImage3;
    Intent intent;
    String[] FILE;
    String camerastate="";

    //cameraend



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_one);
        submit=(Button) findViewById(R.id.Submit);
        ///

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText t1=(EditText) findViewById(R.id.t1);
                    String p1=t1.getText().toString();

                    EditText t2=(EditText) findViewById(R.id.t2);
                    String p2=t2.getText().toString();


                    String p3=sp1;

                    EditText t4=(EditText) findViewById(R.id.t4);
                    String p4=t4.getText().toString();

                    EditText t5=(EditText) findViewById(R.id.t5);
                    String p5=t2.getText().toString();

                    EditText t6=(EditText) findViewById(R.id.t6);
                    String p6=t6.getText().toString();

                    EditText t7=(EditText) findViewById(R.id.t7);
                    String p7=t7.getText().toString();

                    EditText t8=(EditText) findViewById(R.id.t8);
                    String p8=t8.getText().toString();

                    EditText t9=(EditText) findViewById(R.id.t9);
                    String p9=t9.getText().toString();

                    EditText t10=(EditText) findViewById(R.id.t10);
                    String p10=t10.getText().toString();

                    EditText t11=(EditText) findViewById(R.id.t11);
                    String p11=t11.getText().toString();

                    EditText t12=(EditText) findViewById(R.id.t12);
                    String p12=t12.getText().toString();

                    EditText t13=(EditText) findViewById(R.id.t13);
                    String p13=t13.getText().toString();

                    String p14=sp2;

                    EditText t15=(EditText) findViewById(R.id.t15);
                    String p15=t15.getText().toString();

                    EditText t16=(EditText) findViewById(R.id.t16);
                    String p16=t16.getText().toString();

                    EditText t17=(EditText) findViewById(R.id.t17);
                    String p17=t17.getText().toString();

                    EditText t18=(EditText) findViewById(R.id.t18);
                    String p18=t18.getText().toString();


                    String p19=sp3;

                    EditText t20=(EditText) findViewById(R.id.t20);
                    String p20=t20.getText().toString();

                    EditText t21=(EditText) findViewById(R.id.t21);
                    String p21=t21.getText().toString();





                   // Toast.makeText(NoticeOne.this,p1+p2+p3+p4+p5+p8,Toast.LENGTH_SHORT).show();



                    try {




                        ContentValues values = new ContentValues();
                        String folder="/"+"PCM_APP"+"/"+p21+"/";
                        values.put(MediaStore.MediaColumns.DISPLAY_NAME, p21);       //file name
                        values.put(MediaStore.MediaColumns.MIME_TYPE, "application/msword");        //file extension, will automatically add to file
                        values.put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOCUMENTS + folder);     //end "/" is not mandatory

                        Uri uri = getContentResolver().insert(MediaStore.Files.getContentUri("external"), values);      //important!

                        OutputStream outputStream = getContentResolver().openOutputStream(uri);

                        String a="sameet";
                        

                        outputStream.write(( "\t\t\t\t        पिंपरी चिंचवड महानगरपालिका पिंपरी, पुणे -४११०१८\n\t\t\t\t        कार्यकारी अभियंता तथा पदनिर्देशित अधिकारी\n\t\t\t\t        बांधकाम परवानगी व अनधिकृत बांधकाम नियंत्रण विभाग" +
                                "\n\t\t\t\t        जा.क्र. बीपी / दि.बो. / प्र.क्र.०४ / "+p1+"   / २०२०\n\t\t\t               दिनांक -"+ p2 +
                                "\n\n\t\t\t\t\t         " +
                                "\n" +
                                "\t\t\t\t\t\tसूचना" +
                                "\n\n" +
                                "प्रति," +
                                "\n" +
                                "\tमालक / विकसक / ऑक्युपायर :-\n" +
                                "\t"+p3+" -"+p21+"\n" +
                                "\tपत्ता :- "+p4+" \n" +
                                "\t\t          " +
                                "\n\n" +
                                "       \n\n   महाराष्ट्र महानगरपालिका अधिनियम चे कलम ४७८(१), कलम ४३३(क) अन्वये सूचना देण्यात येते की  " +
                                "तुम्ही पिंपरी चिंचवड महानगरपालिकेची बांधकाम परवानगी न घेता बिगर परवाना अनधिकृत बांधकाम केलेचे  " +
                                "निदर्शनास आले आहे. सदर बिगर परवाना अनधिकृत बांधकामाची माहिती खालीलप्रमाणे :-  \n\n" +
                                "गाव  –  "+p5+"          मोजे  –  "+p6+"       ता. –  "+p7+"        जि. पुणे\n" +
                                "ठिकाण  –  "+p8+" \n" +
                                "स.नं. / सि.टी.स.नं. / गट नं. – "+p9+"\n" +
                                "बांधकामाचे मोजमाप – अंदाजे "+p10+" मी. X "+p11+" मी. X "+p12+" मजले = "+p13+" चौ.मी.\n" +
                                "बांधकामाचा प्रकार :-  "+p14+"\n" +
                                "चतु:सिमा –\n" +
                                "\tपूर्वेस     –   "+p15+"\n" +
                                "\tपश्चिमेस   –   "+p16+"\n" +
                                "\tदक्षिणेस   –   "+p17+"\n" +
                                "\tउत्तरेस    –   "+p18+"\n\n" +
                                "\n\n     आपण केलेले सर्व बांधकाम अनधिकृत आहे. सदरचे वरीलप्रमाणे केलेले अनधिकृत बांधकाम तुम्ही ही सूचना पोहोचविल्यापासून ०१ दिवसांच्या " +
                                "आत काढून टाकावे. वेळ प्रसंग पडल्यास प्रत्यक्ष कारवाईच्या वेळी सदरच्या बांधकामाच्या जागेवर भरतील ती व असतील ती स्थितीप्रमाणे, त्यासहचे सर्व बांधकाम याप्रमाणे" +
                                " तुम्ही बिगर परवाना बांधकाम काढून टाकण्याची व्यवस्था न केल्यास ते बांधकाम आम्ही काढून टाकू, त्याबाबत होणारा खर्च तुमच्याकडून वसूल करण्यात येईल. तसेच सदरच्या " +
                                "सूचनेबाबत आपल्याकडील कोणताही खुलासा/ पत्र ग्राहय धरता येणार नाही.\n\n\n" +
                                "\tसदरचे अनधिकृत/बिगर परवाना बांधकामाबाबत महाराष्ट्र महानगरपालिका अधिनियम चे कलम २६१, २६४, २६७ आणि ४७८ मधील तरतुदीनुसार मा. आयुक्त यांचे आदेश क्रमांक " +
                                "अति/३/कावि/१००/२०१२ दि.१६/६/२०१२अन्वये पदनिर्देशित" +
                                " अधिकारी म्हणुन कारवाई करण्याचे आधिकारी आम्हाला आहेत याची नोंद घ्यावी.\n" +
                                "\t\t\t\t\t\t                   पदनिर्देशित अधिकारी तथा \n" +
                                "\t\t\t\t\t\t          कार्यकारी अभियंता ( ‘"+p19+" ’ क्षेत्रिय कार्यालय ) \n" +
                                "\t\t\t\t           बांधकाम परवानगी व अनधिकृत बांधकाम नियंत्रण विभाग\n" +
                                "  \t\t\t\t\t    पिंपरी चिंचवड महानगरपालिका, पिंपरी, पुणे– "+p20+"").getBytes());

                        outputStream.close();

                        Toast.makeText(NoticeOne.this, "File created successfully", Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        Toast.makeText(NoticeOne.this, "Fail to create file", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        //

        //spinnerdropdown

        Spinner spin = (Spinner) findViewById(R.id.t3);
        Spinner spin2=(Spinner) findViewById(R.id.t14);
        Spinner spin3=(Spinner)findViewById(R.id.t19);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, type1);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter3);


        spin.setOnItemSelectedListener(NoticeOne.this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                sp1=users[position];

               // Toast.makeText(getApplicationContext(), "Selected User: "+users[position] , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                sp2=types[position];
                //Toast.makeText(getApplicationContext(), "Selected types: "+types[position] , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });


        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                sp3=type1[position];
                //Toast.makeText(getApplicationContext(), "Selected types: "+type1[position] , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

    //spinnerenddropdown








//calculation
        t10=(EditText)findViewById(R.id.t10);
        t11=(EditText)findViewById(R.id.t11);
        t12=(EditText)findViewById(R.id.t12);
        t13=(EditText)findViewById(R.id.t13);


         t13.setOnFocusChangeListener(new View.OnFocusChangeListener() {
             @Override
             public void onFocusChange(View v, boolean hasFocus) {

                 try{
                     if(hasFocus) {
                         int v1 = Integer.parseInt(t10.getText().toString());
                         int v2 = Integer.parseInt(t11.getText().toString());
                         int v3 = Integer.parseInt(t12.getText().toString());
                         int res = v1 * v2 * v3;
                         String result = String.valueOf(res);


                         t13.setText(result);
                         t13.setEnabled(false);
                     }

                 }catch (Exception e){
                     Toast.makeText(NoticeOne.this, "Please try again", Toast.LENGTH_LONG).show();
                 }


             }
         });
     //calculationend
        //camera1

        imageViewLoad = (ImageView) findViewById(R.id.cam1);
        LoadImage = (Button)findViewById(R.id.bcam1);
        LoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                camerastate="cam1";
                intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(intent, IMG_RESULT);


            }
        });

        imageViewLoad1 = (ImageView) findViewById(R.id.cam2);
        LoadImage1 = (Button)findViewById(R.id.bcam2);
        LoadImage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                camerastate="cam2";
                intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(intent, IMG_RESULT);

            }
        });

        imageViewLoad2 = (ImageView) findViewById(R.id.cam3);
        LoadImage2 = (Button)findViewById(R.id.bcam3);
        LoadImage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                camerastate="cam3";
                intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);


                startActivityForResult(intent, IMG_RESULT);




            }
        });

        imageViewLoad3 = (ImageView) findViewById(R.id.cam4);
        LoadImage3 = (Button)findViewById(R.id.bcam4);
        LoadImage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                camerastate="cam4";
                intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(intent, IMG_RESULT);


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {


            if (requestCode == IMG_RESULT && resultCode == RESULT_OK
                    && null != data) {


                Uri URI = data.getData();
                String[] FILE = { MediaStore.Images.Media.DATA };


                Cursor cursor = getContentResolver().query(URI,
                        FILE, null, null, null);

                cursor.moveToFirst();

                int columnIndex = cursor.getColumnIndex(FILE[0]);
                ImageDecode = cursor.getString(columnIndex);
                cursor.close();


                if(camerastate.equals("cam1")) {
                    imageViewLoad.setImageBitmap(BitmapFactory
                            .decodeFile(ImageDecode));
                    String path1=URI.getEncodedPath();

                    //



                    //


                }

                if(camerastate.equals("cam2")) {

                    imageViewLoad1.setImageBitmap(BitmapFactory
                            .decodeFile(ImageDecode));


                }
                if(camerastate.equals("cam3")) {
                    imageViewLoad2.setImageBitmap(BitmapFactory
                            .decodeFile(ImageDecode));


                }

                if(camerastate.equals("cam4")) {
                    imageViewLoad3.setImageBitmap(BitmapFactory
                            .decodeFile(ImageDecode));
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "Please try again", Toast.LENGTH_LONG)
                    .show();
        }
}
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}