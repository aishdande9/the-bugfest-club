import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';

const GoogleMapsPage = () => {
  return (
    <div className="fixed inset-0 z-0">
      <MapContainer
        center={[37.7749, -122.4194]}
        zoom={10}
        className="w-full h-full"
      >
        <TileLayer
          attribution='&copy; <a href="https://osm.org/copyright">OpenStreetMap</a>'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />
        <Marker position={[37.7749, -122.4194]}>
          <Popup>
            San Francisco<br /> Default location.
          </Popup>
        </Marker>
      </MapContainer>
    </div>
  );
};

export default GoogleMapsPage;
