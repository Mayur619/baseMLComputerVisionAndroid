package edu.ilab.covid_id.data;

import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;

import androidx.annotation.NonNull;

/**
 * Class to facilitate connections to the Firestore DB
 */
public class FirestoreHelper {
    /**
     * handle for connection for Firestore
     */
    private FirebaseFirestore mFirestore;



    /**
     * handle for manipulating firestore settings
     */
    FirebaseFirestoreSettings settings;



    /**
     * Constructor that initializes a connection to the firestore
     */
    public FirestoreHelper() {
        mFirestore = FirebaseFirestore.getInstance();
        // mFirestore = FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        // set firestore offline persistence to true
        settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        mFirestore.setFirestoreSettings(settings);
    }

    /**
     * adds a record to the firestore CovidRecord document collection with some success/failure
     * listeners for logging
     * @param record to add
     */
    public void addRecord(CovidRecord record) {
        mFirestore.collection("CovidRecord").add(record)
            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                @Override
                public void onSuccess(DocumentReference documentReference) {
                    Log.d("DBSTORE", "DocumentSnapshot written with ID: " + documentReference.getId());
                }
            })
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.w("DBSTORE", "Error adding document", e);
                }
            });
    }

    /**
     * adds a record to the firestore MaskRecord document collection
     * @param record
     *
     */
    public void addRecord(MaskRecord record) {
        // mFirestore.collection("CovidRecord").add(record);

        mFirestore.collection("MaskRecord").add(record).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("DBSTORE", "DocumentSnapshot written with ID: " + documentReference.getId());
            }


        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("DBSTORE", "Error adding document", e);
                    }
                });

    }

    /**
     * adds a record to the firestore FeverRecord document collection
     * @param record
     *
     */
    public void addRecord(IRRecord record) {
        // mFirestore.collection("CovidRecord").add(record);

        mFirestore.collection("FeverRecord").add(record).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("DBSTORE", "DocumentSnapshot written with ID: " + documentReference.getId());
            }


        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("DBSTORE", "Error adding document", e);
                    }
                });

    }


    /**
     * adds a record to the firestore CrowdRecord document collection
     * @param record
     *
     */
    public void addRecord(CrowdRecord record) {
        // mFirestore.collection("CovidRecord").add(record);

        mFirestore.collection("CrowdRecord").add(record).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("DBSTORE", "DocumentSnapshot written with ID: " + documentReference.getId());
            }


        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("DBSTORE", "Error adding document", e);
                    }
                });

    }


    /**
     * adds a record to the firestore SocDistRecord document collection
     * @param record
     *
     */
    public void addRecord(SocDistRecord record) {
        // mFirestore.collection("CovidRecord").add(record);

        mFirestore.collection("SocDistRecord").add(record).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("DBSTORE", "DocumentSnapshot written with ID: " + documentReference.getId());
            }


        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("DBSTORE", "Error adding document", e);
                    }
                });

    }



}
