import { AppShell } from "src/components";
import { Outlet } from "react-router-dom";
import { AppHeader, AppNavBar } from "./components";

export const AppLayout = () => {
  return (
    <>
      <AppShell navbar={<AppNavBar />} header={<AppHeader />}>
        <Outlet />
      </AppShell>
    </>
  );
};
