import React, { Component } from 'react';
import { View, Text } from 'native-base';
import { Button, Card } from 'react-native-elements';


class AppLoading extends Component {
    render() {
        return (
            <View>
                <Card title='Message'>
                    <Text>Now Loading...</Text>
                </Card>
            </View>

        )
    }
}

export default AppLoading