import React, {Component} from 'react';
import { createAppContainer } from 'react-navigation'
import { createStackNavigator } from 'react-navigation-stack'
import { Text } from 'native-base';
import { Button, Card } from 'react-native-elements';

import Main from './screens/Main'
import Modal from './screens/Modal'
import AppLoading from './screens/Loading'

const MainNavigation = createStackNavigator(
  {
    Main: { screen: Main },
    Modal: { screen: Modal },
  },
  {initialRouteName: 'Main', mode: 'card', headerMode: 'none'}
)
// const NestNavigation = createStackNavigator(
//   {
//     MainNavigation: { screen: MainNavigation },
//     Modal: { screen: Modal },
//   },
//   {initialRouteName: 'MainNavigation', mode: 'modal', headerMode: 'none'},
// )

const AppContainer = createAppContainer(MainNavigation);

type Props = {};
export default class App extends Component<Props> {
  constructor(props) {
    super(props);
    this.state = {
      isReady: false
    };
  }

  componentWillMount() {
    this._loadResourcesAsync();
  }

  async _loadResourcesAsync() {
    await Expo.Font.loadAsync({
      Roboto: require('./node_modules/native-base/Fonts/Roboto.ttf'),
      Roboto_medium: require('./node_modules/native-base/Fonts/Roboto_medium.ttf'),
    });
    this.setState({ isReady: true });
  }

  render() {
    if (!this.state.isReady) {
      return <AppLoading />;
    }

    return (
      <AppContainer />
    );
  }
}