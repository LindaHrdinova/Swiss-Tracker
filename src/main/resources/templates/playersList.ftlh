[#ftl]
[@l.page title=" - seznam hráčů"]
    <h1>Seznam hráčů</h1>

    [#if players?size == 0]
        <p>Prázdný seznam hráčů.</p>
    [#else]
        [#list divisions as division]
            <h2>${division?cap_first}</h2>
            <table>
                <thead>
                <tr>
                    <th>Pořadí</th>
                    <th>ID hráče</th>
                    <th>Jméno</th>
                </tr>
                </thead>
                <tbody>
                [#list players as player]
                    [#if player.playerDivision == division]
                        <tr>
                            <td>${player?counter}</td>
                            <td>${player.playerId}</td>
                            <td>${player.playerName}</td>
                        </tr>
                    [/#if]
                [/#list]
                </tbody>
            </table>
        [/#list]
    [/#if]

    <div>
        <a href="/addPlayer">
            <button type="button">Přidat hráče</button>
        </a>
        <a href="/">
            <button type="button">Turnaj</button>
        </a>
    </div>
[/@l.page]