import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
   public TextView estado;
   public ImageView mapaParana;
   public ImageView mapaRiogrande;
   public ImageView mapaStCatarina;

   public TextView idh;
   public TextView populacao;
   public TextView densidade;
   public TextView area;
   public TextView municipios;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       mapaParana = findViewById(R.id.mapaParana);
       mapaRiogrande = findViewById(R.id.mapaRiogrande);
       estado = findViewById(R.id.estado);
       mapaStCatarina = findViewById(R.id.mapaStCatarina);
       populacao = findViewById(R.id.populacao);
       densidade = findViewById(R.id.densidade);
       area = findViewById(R.id.area);
       municipios = findViewById(R.id.municipios);
   }
   public void pesquisar(View view){
       String estado1 = estado.getText().toString();
       String PARANA = "parana";

       if (estado1==PARANA){
           mapaParana.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,749 [2010]");
           area.setText("Área territorial: 199.298,981 km² [2022]\n");
           densidade.setText("Densidade demográfica: 52,40 hab/km² [2010]");
           municipios.setText("Número municípios: 284");
           populacao.setText("População estimada: 11.597.484 pessoas [2021]");
       }
       if (estado1.toLowerCase() == "santa catarina" || estado1.toLowerCase() == "sc"){
           mapaParana.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,774   [2010]");
           area.setText("Área territorial: 95.730,690km² [2022]");
           densidade.setText("Densidade demográfica: 65,29 hab/km²  [2010]");
           municipios.setText("Número municípios: 295");
           populacao.setText("População estimada: 7.338.473 pessoas [2021]");
       }
       if (estado1.toLowerCase() == "rio grande do sul" || estado1.toLowerCase() == "rs"){
           mapaParana.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,746   [2010]");
           area.setText("Área territorial: 281.707,151km²   [2022]");
           densidade.setText("Densidade demográfica: 39,79 hab/km²   [2010]");
           municipios.setText("Número municípios: 497");
           populacao.setText("População estimada: 11.466.630 pessoas   [2021]");
       }
   }

}
