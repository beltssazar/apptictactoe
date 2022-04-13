package devnoite.progandroid.jogodavelhaapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import devnoite.progandroid.jogodavelhaapp.R;
import devnoite.progandroid.jogodavelhaapp.databinding.FragmentInicioBinding;

public class InicioFragment extends Fragment {

    private FragmentInicioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater, container, false);
        binding.botaoInicio.setOnClickListener(v ->{
            NavHostFragment.findNavController(InicioFragment.this).navigate(R.id.action_inicioFragment_to_jogoFragment);
        });
        return binding.getRoot();
    }
    @Override
    public void onStart(){
        super.onStart();
        //pega a referência para a activity
        AppCompatActivity minhaActivity = (AppCompatActivity) getActivity();
        //oculta a action bar
        minhaActivity.getSupportActionBar().hide();
    }




}