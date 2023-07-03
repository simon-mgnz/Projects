import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Mon Application',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: WelcomeScreen(),
    );
  }
}

class WelcomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Écran de bienvenue'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(
              onPressed: () {
                // Action pour le bouton "Invité"
                // À définir selon les besoins
              },
              child: Text('Invité'),
            ),
            ElevatedButton(
              onPressed: () {
                // Action pour le bouton "Se connecter"
                // À définir selon les besoins
              },
              child: Text('Se connecter'),
            ),
            ElevatedButton(
              onPressed: () {
                // Action pour le bouton "S'inscrire"
                // À définir selon les besoins
              },
              child: Text("S'inscrire"),
            ),
          ],
        ),
      ),
    );
  }
}