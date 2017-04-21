package com.example.usuario.segundaconexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by usuario on 16-abr-17.
 */

public class BDAlumnos extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE Alumnos (codigo INTEGER, nombre TEXT)";

    public BDAlumnos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // de no existir la base de datos la crea y ejecuta los siguientes comandos
        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //Se elimina la vercion anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Alumnos");

        // se crea la nueva vercion de la tabla
        db.execSQL(sqlCreate);

    }
}
