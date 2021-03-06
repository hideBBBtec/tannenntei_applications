import React, {Component} from 'react';
import { Container, Header, Left, Body, Right, Button, Icon, Title } from 'native-base';
import { View, Text, StyleSheet } from 'react-native';


type Props = {};
export default class Modal extends Component<Props> {
  render() {
    return (
      <Container>
        <Header>
          <Left>
            <Button transparent onPress={() => this.props.navigation.goBack()}>
              <Icon name='close' />
            </Button>
          </Left>
          <Body>
            <Title>モーダル</Title>
          </Body>
          <Right />
        </Header>

      </Container>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: '#fff'
  }
});