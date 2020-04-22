import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

class SavedList extends StatefulWidget {
  SavedList({@required this.saved});

  final Set<WordPair> saved; //주소를 받아와서 값을 수정할 수 있게 만든다.

  @override
  _SavedListState createState() => _SavedListState();
}

class _SavedListState extends State<SavedList> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Saved")),
      body: _buildList(),
    );
  }

  Widget _buildList() {
    return ListView.builder(
        itemCount: widget.saved.length * 2,
        itemBuilder: (context, index) {
          //length *2를 해주는 이유 : 디바이더(선)도 인덱스니까
          if (index.isOdd) return Divider();

          return _buildRow(
              widget.saved.toList()[index ~/ 2]); //선들 빼고 -> 0,2,4,6,8
        });
  }

  Widget _buildRow(WordPair wordPair) {
    return ListTile(
      title: Text(
        wordPair.asPascalCase,
        textScaleFactor: 1.5,
      ),
      onTap: () {
        setState(() {
          widget.saved.remove(wordPair);
        });
      },
    );
  }
}
