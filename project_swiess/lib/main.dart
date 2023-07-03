import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Mon Application'),
        ),
        body: AspectRatio(
          aspectRatio: 9 / 16,
          child: Container(
            color: Colors.white,
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                RaisedButton(
                  onPressed: () {
                    // Action du bouton "Invité"
                  },
                  child: Text('Invité'),
                ),
                RaisedButton(
                  onPressed: () {
                    // Action du bouton "Se connecter"
                  },
                  child: Text('Se connecter'),
                ),
                RaisedButton(
                  onPressed: () {
                    // Action du bouton "S'inscrire"
                  },
                  child: Text("S'inscrire"),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
