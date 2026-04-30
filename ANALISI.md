
1.)

- Mala pràctica: Mètode massa llarg i fa massa coses
- On: mètode programarSessio()
- Patró de refacció suggerit: Extract Method: Extreure blocs de codi a submètodes independents.

2.)

- Mala pràctica:Ús de text com a codi d'error (Retornar Strings amb errors barrejats amb resultats correctes)
- On: mètode programarSessio()
- Patró de refacció suggerit: Llançar excepcions específiques (ex: SalaNotFoundException, CapacityExceededException) i deixar que el mètode només retorni l'objecte creat o l'ID en cas d'èxit.

3.)

- Mala pràctica: Nombre màgic 
- On: mètode programarSessio()
- Patró de refacció suggerit: Replace Magic Number with Symbolic Constant: Crear una constant amb un nom descriptiu.

4.)

- Mala pràctica: Lògica de cerca repetitiva
- On: mètode programarSessio()
- Patró de refacció suggerit: Extract Method / Use Streams: Moure les cerques a mètodes d'ajuda, o utilitzar diccionaris (Map) en comptes de List per accedir-hi ràpidament sense iterar.

5.)

- Mala pràctica: Barreja de lògica de negoci amb presentació
- On: mètode programarSessio()
- Patró de refacció suggerit: eparate Logic from Presentation: Eliminar els prints. La classe encarregada de la interfície d'usuari (o l'invocador del mètode) és qui hauria de gestionar com es mostra l'èxit de l'operació.

#    MALA‌  PRACTICA             |      ON                  |   PATRO DE REFACCIÓ SUGGERIT

1   Nom poc descriptius               Mètode proc
                                    variables(t,s,pp,tot)       Rename
                            
2  Exces de condicionals             Mètode proc                Clàusules de guarda i retonrs rapids

3  Ús de números magics              Mètode proc                Utilitzar constants

4  Principi de Responsabilitat       Mètode proc                Separar el càlcul del preu, la impressió
    unica                                                       i l'emmagatzematge
    
5   Lògica condicionada per           Mètode proc               Utilitzar el patró Strategy
    un String                           

