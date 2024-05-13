<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Running PM5CLIEv2 on Windows</title>
</head>
<body>
    <h1>Running a PM5CLIEv2 on Windows</h1>
    <p>This guide will walk you through the process of installing Amazon Corretto, a distribution of the Open Java Development Kit (OpenJDK), and running PM5CLIEv2 from the Command Prompt (CMD) in Windows.</p>
    
<h2>Prerequisites</h2>
    <ul>
        <li>Windows operating system</li>
        <li>Internet connection</li>
    </ul>

<h2>Installing Amazon Corretto</h2>
<ol>
        <li>
            <strong>Download Amazon Corretto</strong>:
            <ul>
                <li>Go to the <a href="https://aws.amazon.com/corretto/">Amazon Corretto website</a> in your web browser.</li>
                <li>Select the version of Corretto you want to download (e.g., Corretto 11).</li>
                <li>Choose the appropriate installer for your system (e.g., Windows MSI installer).</li>
            </ul>
        </li>
        <li>
            <strong>Run the Installer</strong>:
            <ul>
                <li>Once the download is complete, locate the downloaded MSI installer file and double-click on it to run the installation wizard.</li>
                <li>Follow the on-screen instructions to complete the installation process. Make sure to note the installation directory.</li>
            </ul>
        </li>
        <li>
            <strong>Set up Environment Variables</strong> (Optional):
            <ul>
                <li>After installation, you may need to set up the <code>JAVA_HOME</code> environment variable to point to the installation directory of Amazon Corretto. This step is optional but can be helpful for running Java or Kotlin programs from the Command Prompt.</li>
            </ul>
        </li>
    </ol>

<h2>Running PM5CLIEv2 Program</h2>
    <ol>

<li>
            <strong>Run PM5CLIEv2</strong>:
            <ul>
                <li>With Amazon Corretto installed, you can now run the compiled Kotlin program using the <code>.cmd</code> file.
            </ul>
            <ul>
            <li>Go to the folder PM5CLIv2
            </li>
            </ul>
            <ul>
            <li>Double Click on <code>PM5CLIEv2.cmd</code> to launch the command-line interface of Pandora Mathematics-5 CLI Edition v2</li>
            </ul>
        </li>
        <li>
            <strong>View Output</strong>:
            <ul>
                <li>If the PM5CLIv2 program produces any output, you should see it in the Command Prompt window.</li>
            </ul>
        </li>
    </ol>

<p>Congratulations! You have successfully installed Amazon Corretto and run PM5CLIv2 from CMD in Windows.</p>
</body>
</html>
