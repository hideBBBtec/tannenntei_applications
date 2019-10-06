import React, {Component} from 'react';
import { Container, View, Header, Left, Body, Right, Button, Title, Text } from 'native-base';
import { StyleSheet, Image, Dimensions, ImageBackground } from 'react-native'
import { getStatusBarHeight } from 'react-native-status-bar-height'

type Props = {};
export default class Main extends Component<Props> {
  modal = () => {
    const { navigation } = this.props
    navigation.navigate('Modal')
  }
  render() {
    return (
      <View style={styles.container}>
        <ImageBackground source={require('../assets/puzzle1.png')} style={{flex: 1, width: Dimensions.get('window').width, height: Dimensions.get('window').height, backgroundColor: 'lightblue' }} >
          <Text style={styles.title}>軽井沢で見つけた{'\n'}難しいパズル</Text>
          <Button small iconRight  transparent primary onPress={this.modal}  style={styles.button}>
            <Text style={styles.black}>Start</Text>
          </Button>
          <Text style={styles.white}>created by hideBBB using ReactNative with expo.</Text>
          <Text style={styles.white}>Copyright © 2019 旦念亭 All Rights Reserved.</Text>
        </ImageBackground>
      </View>
    );
  }
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  white: {
    color: '#fff'
  },
  black: {
    color: '#000'
  },
  button: {
    backgroundColor: '#778899',
    alignItems: 'center',
    justifyContent: 'center',
    borderStyle: 'solid',
    width: 100,
    height: 40,
    marginBottom: 70,
    alignSelf: 'center'
  },
  title: {
    flex:1,
    marginTop: getStatusBarHeight()+35,
    fontWeight: 'bold',
    fontSize : 24,
    textAlign: 'center'
  }

});


