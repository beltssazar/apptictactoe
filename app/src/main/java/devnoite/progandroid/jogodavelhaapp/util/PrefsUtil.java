package devnoite.progandroid.jogodavelhaapp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefsUtil {
    public static String getSimboloJog1(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("simb_jog_1","X");
    }
    public static String getSimboloJog2(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("simb_jog_2","O");
    }

    public static String getNomeJog1(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("nomeJog1","Jogador 1");
    }
    public static String getNomeJog2(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString("nomeJog2","Jogador 2");
    }

    public static void setSimboloJog1(String simbolo, Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("simb_jog_1", simbolo);
        editor.commit();
    }
}
