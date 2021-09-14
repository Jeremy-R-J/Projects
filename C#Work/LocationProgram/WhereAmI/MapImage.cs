using System;
using System.Device.Location;
using System.Diagnostics;
using System.Net;

namespace WhereAmI
{
    class MapImage
    {
        public static void Show(GeoCoordinate location)
        {
            string filename = $"{location.Latitude:##.000},{location.Longitude:##.000},{location.HorizontalAccuracy:####}m.jpg";

            DownloadMapImage(BuildURI(location), filename);

            OpenWithDefaultApp(filename);
        }

        private static void DownloadMapImage(Uri target, string filename)
        {
            using (var client = new WebClient())
            {
                client.DownloadFile(target, filename);
            }
        }

        /// <summary>
        /// Map Image REST API by HERE Location Services
        /// </summary>
        /// <remarks>
        /// https://developer.here.com/
        /// </remarks>
        private static Uri BuildURI(GeoCoordinate location)
        {
            
            string HereApi_AppID = "FzX91U2AhE1JlXPlyBII";
            string HereApi_AppCode = "zIDQ5jEtbF9rs1xpP6oEe0yWJuJDz9vpL9pCj43Ib-g";
          

            var HereApi_Dns = "image.maps.cit.api.here.com";
            var HereApi_URL = $"https://{HereApi_Dns}/mia/1.6/mapview";
            var HereApi_Secrets = $"&app_id={HereApi_AppID}&app_code={HereApi_AppCode}";

            var latlon = $"&lat={location.Latitude}&lon={location.Longitude}";

            return new Uri(HereApi_URL + $"?u={location.HorizontalAccuracy}" + HereApi_Secrets + latlon);
        }

        private static void OpenWithDefaultApp(string filename)
        {
            var si = new ProcessStartInfo()
            {
                FileName = "cmd.exe",
                Arguments = $"/C start {filename}",
                WindowStyle = ProcessWindowStyle.Hidden
            };
            Process.Start(si);
        }
    }
}
