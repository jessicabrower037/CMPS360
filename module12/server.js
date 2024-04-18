const { exec } = require('child_process');

const htmlFilePath = '/index.html';
const port = 8000;

const command = `http-server ${htmlFilePath} -p ${port}`;

exec(command, (error, stdout, stderr) => {
    if (error) {
        console.error(`Error: ${error.message}`);
        return;
    }
    if (stderr) {
        console.error(`stderr: ${stderr}`);
        return;
    }
    console.log(`Server is running at http://localhost:${port}`);
});
