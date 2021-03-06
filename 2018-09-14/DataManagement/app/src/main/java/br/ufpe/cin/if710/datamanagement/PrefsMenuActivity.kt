package br.ufpe.cin.if710.datamanagement

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment

class PrefsMenuActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Carrega um layout que contem um fragmento
        setContentView(R.layout.activity_prefs_menu)

    }

    // Fragmento que mostra a preference com username
    class UserPreferenceFragment : PreferenceFragment() {
        private var mListener: SharedPreferences.OnSharedPreferenceChangeListener? = null
        private var mUserNamePreference: Preference? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            // Carrega preferences a partir de um XML
            addPreferencesFromResource(R.xml.user_prefs)

            /*
            // pega a Preference especifica do username
            mUserNamePreference = preferenceManager.findPreference(PrefsActivity.USERNAME)

            // Define um listener para atualizar descricao ao modificar preferences
            mListener = SharedPreferences.OnSharedPreferenceChangeListener { sharedPreferences, key ->
                mUserNamePreference!!.summary = sharedPreferences.getString(
                        PrefsActivity.USERNAME, "Nada ainda")
            }

            // Pega objeto SharedPreferences gerenciado pelo PreferenceManager para este Fragmento
            val prefs = preferenceManager
                    .sharedPreferences

            // Registra listener no objeto SharedPreferences
            prefs.registerOnSharedPreferenceChangeListener(mListener)

            // Invoca callback manualmente para exibir username atual
            mListener!!.onSharedPreferenceChanged(prefs, PrefsActivity.USERNAME)
            */
        }

        companion object {
            protected val TAG = "UserPrefsFragment"
        }
    }
}