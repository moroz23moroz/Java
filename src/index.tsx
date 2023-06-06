import React from 'react';
import ReactDOM from 'react-dom/client';
import { SpaceList } from './pages/SpaceList';
import './index.scss';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <SpaceList />
  </React.StrictMode>
);
