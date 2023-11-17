#include <jni.h>
#include <string>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include "string.h"

// extern "C" JNIEXPORT jstring JNICALL
// Java_com_example_controldmx_MainActivity_stringFromJNI(
//        JNIEnv* env,
//        jobject /* this */) {
//    std::string hello = "Hello from C++";
//    return env->NewStringUTF(hello.c_str());}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_controldmx_MainActivity_stringFromJNI( //appdi04 est le nom de l'application
    JNIEnv* env,
    jobject,
    jstring edit, jintArray trame) {
    std::string message;
    std::string m_adresseIPServeur = "172.20.21.49"; //à modifier
    int m_portServeur = 17777;                //à modifier
    int m_maSocket = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP);
    if(m_maSocket == -1)
    {   message="Creation de la socket : ERREUR.";
        return env->NewStringUTF(message.c_str());
    }
    message="Creation de la socket : OK.";
    struct sockaddr_in serveurAJoindre;
    serveurAJoindre.sin_family = AF_INET;
    serveurAJoindre.sin_addr.s_addr = inet_addr(m_adresseIPServeur.c_str());
    serveurAJoindre.sin_port = htons(m_portServeur);
    int resultat = connect(m_maSocket, (const struct sockaddr *) &serveurAJoindre, sizeof(serveurAJoindre));
    if(resultat != 0) {
        message = "Connection au serveur : ERREUR.";
        return env->NewStringUTF(message.c_str());
    }

    int *tableau=env->GetIntArrayElements(trame,NULL);
    const char *chaine=env-> GetStringUTFChars(edit,NULL);
    sprintf((char*)chaine,"%s %d %d",chaine,tableau[0],tableau[1]);


    message= message+"\nconnecté au serveur";
    std::string messageAEnvoyer=chaine; // sera remplacer par les 512 octets de la trame DMX : stockés dans un tableau de char
    resultat = send(m_maSocket, messageAEnvoyer.c_str(), messageAEnvoyer.length(), 0);
    if (resultat == -1)
    {   message = message+"\nEnvoi du message : ERREUR.";
        return env -> NewStringUTF(message.c_str());
    }

    return env->NewStringUTF(chaine); //message.c_str(),
    //return env->NewStringUTF(message.c_str());
}
/*extern "C" JNIEXPORT jstring JNICALL
Java_com_example_controldmx_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject,
        jstring edit, jintArray trame) {
    int *tableau=env->GetIntArrayElements(trame,NULL);
    const char *chaine=env-> GetStringUTFChars(edit,NULL);
    sprintf((char*))chaine,"%s %d %d",chaine,tableau[0],tableau[1]);
    return env->NewStringUTF(chaine);
    }*/
