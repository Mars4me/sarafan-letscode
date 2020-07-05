import Vue from 'vue'
import Vuetify from 'vuetify'
import "@babel/polyfill"
import 'api/resource'
import router from 'router/router';
import App from 'pages/App.vue'
import store from 'store/store'
import { connect} from "./util/ws";
import 'vuetify/dist/vuetify.min.css'
import * as Sentry from '@sentry/browser'
import { Vue as VueIntegration } from '@sentry/integrations'

Sentry.init({
    dsn: 'https://ac4d65a93ccf447aa5ddd3a6d505a73f@o416164.ingest.sentry.io/5310000',
    integrations: [new VueIntegration({Vue, attachProps: true})],
})
Sentry.configureScope(scope =>
    scope.setUser({
        id:  profile && profile.id,
        username: profile && profile.name
    })
)

if(profile) {
    connect()
}

Vue.use(Vuetify)

new Vue({
    vuetify: new Vuetify(),
    el: '#app',
    store,
    router,
    render: a => a(App)
})
