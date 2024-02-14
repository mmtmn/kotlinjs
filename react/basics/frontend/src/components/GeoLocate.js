import { useEffect, useState } from "react";
function GeoLocate() {
    const [location, setLocation] = useState(null);

    useEffect( () => {
        navigator.geolocation.getCurrentPosition(
        (position) => {
            const {latitude, longitude} = position.coords;
            setLocation(`Latitude: ${latitude}, Longitude: ${longitude}`);
            },
            (error) => {
                setLocation('Unable to retrieve your location');
            }
        );
    }, [])

    return <p>{location ? location : 'Fetching location...'}</p>;
}

export default GeoLocate;