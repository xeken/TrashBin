import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';
import 'saved_list.dart';
class RandomList extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _RandomListState();
}

class _RandomListState extends State<RandomList> {
  final List<WordPair> _suggestions = <WordPair>[]; //모든 단어 배열
  final Set<WordPair> _saved = Set<WordPair>(); // 리스트와 같은데 동일한 오브젝트가 못드감

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("exemple asdasd"),
        actions: <Widget>[
          IconButton(
            icon: Icon(Icons.list),
            onPressed: (){
              Navigator.of(context).push(
                MaterialPageRoute(builder: (context)=> SavedList(saved: _saved)) //데이터를 보내주는 것이 아니라 주소, 즉 레퍼런스를 보내줌 그리하여 값이 변한다.
              );
            },
          )
        ],
      ),
      body: _bulidList(),
    );
  }

  Widget _bulidList() {
    return ListView.builder(itemBuilder: (context, index) {
      //리스트마다 낑겨있는 선들도 아이템(인덱스)임 즉/ 0, 2, 4, 6으로 접근해야함
      if (index.isOdd) return Divider();

      var realIndex = index ~/ 2; // 인덱스를 2로 나눈 몫
      if (realIndex >= _suggestions.length)
        _suggestions.addAll(generateWordPairs().take(10));

      return _buildRow(_suggestions[realIndex]);
    });
  }

  Widget _buildRow(WordPair wordPair) {

    final bool alreadySaved = _saved.contains(wordPair);

    return ListTile(
      title: Text(
        wordPair.asPascalCase,
        textScaleFactor: 1.5,
      ),
      trailing: Icon(
        alreadySaved ? Icons.favorite : Icons.favorite_border,
        color: Colors.pink,
      ),
      onTap: (){
        setState(() {
          if(alreadySaved)
            _saved.remove(wordPair);
          else
            _saved.add(wordPair);
        });
      },
    );
  }
}
